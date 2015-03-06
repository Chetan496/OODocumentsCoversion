package com.documenttopdf.converter;

/**
 * Created by MAC on 3/6/15.
 */

import org.artofsolving.jodconverter.OfficeDocumentConverter;
import org.artofsolving.jodconverter.office.DefaultOfficeManagerConfiguration;
import org.artofsolving.jodconverter.office.OfficeManager;

import java.io.File;

public class DocumentToPDFConverter {

    public static void main(String args[]){

        OfficeManager officeManager = null;

        officeManager = new DefaultOfficeManagerConfiguration()
                .setOfficeHome(new File("/usr/lib64/libreoffice")).buildOfficeManager() ;
        officeManager.start();
        OfficeDocumentConverter officeDocumentConverter = new OfficeDocumentConverter(officeManager);

        //officeDocumentConverter.convert(new File("/home/MAC/DIABETES.xls"),  new File("/home/MAC/diabetes.pdf"));
        officeDocumentConverter.convert(new File("/home/MAC/threatenedamphibians.xlsx"),
                new File("/home/MAC/amphibians.pdf"));

        if(officeManager!=null){
            officeManager.stop();
        }

    }


}
