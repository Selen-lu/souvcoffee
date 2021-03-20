package com.company.souvcoffee.sitemesh3config;

import org.apache.commons.lang3.StringUtils;
import org.sitemesh.DecoratorSelector;
import org.sitemesh.content.Content;
import org.sitemesh.webapp.WebAppContext;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ParamDecoratorSelector implements DecoratorSelector<WebAppContext> {
    private DecoratorSelector<WebAppContext> defaultDecoratorSelector;



    /* xml설정없이  기본 제공 태그 외 설정 태그 추가 */
    /* 여기 폴더는  사용 안함 */
    public ParamDecoratorSelector(DecoratorSelector<WebAppContext> defaultDecoratorSelector) {
        this.defaultDecoratorSelector = defaultDecoratorSelector;
    }

    public String[] selectDecoratorPaths(Content content, WebAppContext context) throws IOException {
        // build decorator based on the request
        HttpServletRequest request = context.getRequest();
        String decorator = request.getParameter("decorator");
        if (StringUtils.isNotBlank(decorator)) {
            // returns the corresponding path following jsp decoration template page in accordance with the parameter values
            return new String[] { "/WEB-INF/views/" + decorator + ".jsp" };
        }

        // Otherwise, fallback to the standard configuration
        return defaultDecoratorSelector.selectDecoratorPaths(content, context);
    }
}