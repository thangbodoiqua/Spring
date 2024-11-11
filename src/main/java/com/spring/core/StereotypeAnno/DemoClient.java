package com.spring.core.StereotypeAnno;

import com.spring.core.StereotypeAnno.controller.DemoController;
import com.spring.core.StereotypeAnno.repository.DemoRepository;
import com.spring.core.StereotypeAnno.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(Appconfig.class);
        DemoController dc = appContext.getBean(DemoController.class);
        DemoService ds = appContext.getBean(DemoService.class);
        DemoRepository dr = appContext.getBean(DemoRepository.class);
        dc.hello();
        ds.hello();
        dr.hello();
    }
}
