package com.xyzcorp;

import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind( RequestService.class ).to( RequestServiceStub.class );
        bind( EmailService.class ).to( EmailServiceStub.class );
        bind( MessageService.class ).to( MessageServiceStub.class );
    }
}
