package com.kodilla.good.patterns;

public class ProductOrderService {

    private InformationService informationService;
    private SellingService sellingService;
    private SellingRepository sellingRepository;

    public ProductOrderService(InformationService informationService, SellingService sellingService, SellingRepository sellingRepository) {
        this.informationService = informationService;
        this.sellingService = sellingService;
        this.sellingRepository = sellingRepository;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public SellingService getSellingService() {
        return sellingService;
    }

    public SellingRepository getSellingRepository() {
        return sellingRepository;
    }

    public SellingDto process(SellRequest sellRequest) {

        boolean isSold = sellingService.sell(sellRequest.getUser(), sellRequest.getProduct(), sellRequest.getRequestDate());

        if (isSold) {
            informationService.orderSent();
            sellingRepository.createRepository(sellRequest.getUser(), sellRequest.getProduct(), sellRequest.getRequestDate());

            return new SellingDto(sellRequest.getUser(), true);
        } else
            return new SellingDto(sellRequest.getUser(), false);
    }
}
