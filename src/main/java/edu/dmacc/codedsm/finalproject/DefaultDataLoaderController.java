package edu.dmacc.codedsm.finalproject;

public class DefaultDataLoaderController implements DataLoaderController {

    DataLoaderService service;

    public DefaultDataLoaderController(DataLoaderService service) {

        this.service = service;
    }

    @Override
    public void loadData() {
        service.readFile();
    }
}
