package com.Myht.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class LoggerFilter extends HttpServlet implements Filter{

	private FilterConfig filterConfig;
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(filterConfig == null){
			throw new ServletException("FilterConfig not set before first request");
		}
		filterConfig.getServletContext().log("in LoggerFilter");
		System.out.println("in LoggerFilter");
		
		long starTime=System.currentTimeMillis();
		String remoteAddress=req.getRemoteAddr();
		String remoteHost=req.getRemoteHost();
		HttpServletRequest myReq=(HttpServletRequest) req;
		String reqURI=myReq.getRequestURI();
		System.out.println(reqURI);
		System.out.println(remoteAddress);
		System.out.println(remoteHost);
			req.setAttribute("URI", reqURI);
			req.setAttribute("RAddress", remoteAddress);
			req.setAttribute("RHost", remoteHost);
			filterChain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig=config;
	}

}
