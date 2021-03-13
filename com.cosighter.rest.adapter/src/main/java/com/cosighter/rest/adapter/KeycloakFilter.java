package com.cosighter.rest.adapter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.keycloak.adapters.servlet.KeycloakOIDCFilter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardFilterPattern;

@HttpWhiteboardFilterPattern(value = {"/keycloak/*", "/api/*"})
@Component(
	    immediate = true,
	    service = Filter.class,
	    property = {
//	        KeycloakOIDCFilter.CONFIG_FILE_PARAM + "=" + "/Users/abdulkadiryilmaz/Downloads/keycloak_spring.json",
	        HttpWhiteboardConstants.HTTP_WHITEBOARD_FILTER_PATTERN + "=" +"/*",
//	        HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT + "=" + "(osgi.http.whiteboard.context.name=api)"
	    }
	)
public class KeycloakFilter extends KeycloakOIDCFilter {
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse)res;
		resp.setHeader("Access-Control-Allow-Origin", "*");
		super.doFilter(req, res, chain);
	}

}
