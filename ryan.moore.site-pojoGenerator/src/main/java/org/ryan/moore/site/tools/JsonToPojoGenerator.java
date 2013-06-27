package org.ryan.moore.site.tools;

import com.googlecode.jsonschema2pojo.SchemaMapper;
import com.sun.codemodel.JCodeModel;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * user: ryan.moore
 * date: 10/4/12
 */
public class JsonToPojoGenerator {

    public static void main(String[] args) {

        JCodeModel codeModel = new JCodeModel();

        URL source = null;
        try {
            source = new URL("file:/Users/ryanmoore/dev/me/ryan.moore.site/ryan.moore.site-pojoGenerator/src/main/java/org/ryan/moore/site/tools/jsonExample.txt");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            new SchemaMapper().generate(codeModel, "NFLTeams", "org.ryan.moore.site", source);
            codeModel.build(new File("/Users/ryanmoore/dev/me/ryan.moore.site/ryan.moore.site-pojoGenerator/src/main/java/org/ryan/moore/site/tools/output"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
