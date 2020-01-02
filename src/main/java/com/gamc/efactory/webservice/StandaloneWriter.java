package com.gamc.efactory.webservice;

import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by Zeho Lee on 2019/10/15.
 */
public class StandaloneWriter extends XMLWriter {
    StandaloneWriter(Writer writer, OutputFormat outputFormat){
        super(writer,outputFormat);
    }
    protected void writeDeclaration() throws IOException {
        OutputFormat format = getOutputFormat();

        String encoding = format.getEncoding();

        if (!format.isSuppressDeclaration()) {
            if (encoding.equals("UTF-8")) {
                writer.write("<?xml version=\"1.0\"");

                if (!format.isOmitEncoding()) {
                    writer.write(" encoding=\"UTF-8\"");
                }

                writer.write(" standalone=\"yes\"");
                writer.write("?>");
            } else {
                writer.write("<?xml version=\"1.0\"");

                if (!format.isOmitEncoding()) {
                    writer.write(" encoding=\"" + encoding + "\"");
                }

                writer.write(" standalone=\"true\"");
                writer.write("?>");
            }

            if (format.isNewLineAfterDeclaration()) {
                println();
            }
        }
    }
}
