/**
 * Copyright (C) 2015 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 * This source is part of
 * https://github.com/WolfgangFahl/Mediawiki-Japi
 * and the license for Mediawiki-Japi applies
 * 
 */
package com.bitplan.mediawiki.japi;

import com.bitplan.mediawiki.japi.api.Edit;
import com.bitplan.mediawiki.japi.api.General;
import com.bitplan.mediawiki.japi.api.Login;

/**
 * Mediawiki API Interface
 * see <a href="https://www.mediawiki.org/wiki/API:Main_page">https://www.mediawiki.org/wiki/API:Main_page</a>
 * @author wf
 *
 */
public interface MediawikiApi {
	/**
	 * @return the siteurl
	 */
	public String getSiteurl();
	
	/**
	 * set the siteurl
	 * @param siteurl
	 * @throws Exception - if the url is not o.k.
	 */
	public void setSiteurl(String siteurl) throws Exception;
	
	/**
	 * get the Version of this Mediawiki
	 * @return the the version string
	 * @throws Exception 
	 */
	public String getVersion() throws Exception;
	
	/**
	 * get the general siteinfo
	 * @return the siteinfo
	 * @throws Exception 
	 */
	public General getSiteInfo() throws Exception;
	
	/**
	 * login the given user with the given password
	 * 
	 * See <a href="https://www.mediawiki.org/wiki/API:Login">API:Login</a>
	 * 
	 * @param username
	 * @param password
	 * @return the Login information as returned by the API
	 * @throws Exception 
	 */
	public Login login(String username, String password) throws Exception;
	
	/**
	 * 
	 * Log the current user out
	 * See <a href="https://www.mediawiki.org/wiki/API:Logout">API:Logout</a>
	 * @throws Exception 
	 */
	public void logout() throws Exception;
	
	/**
	 * get the page Content for the given page Title
	 * @param pageTitle
	 * @return the content of the page
	 * @throws Exception
	 */
	public String getPageContent(String pageTitle) throws Exception;
	
	 /**
   *  Edits a page by setting its text to the supplied value. 
   *
   *  @param text the text of the page
   *  @param pagetitle the title of the page
   *  @param summary the edit summary. Summaries
   *  longer than 200 characters are truncated server-side.
	 *  @return the edit stage as a wrapped Edit API response 
	 *  @throws Exception - if the edit fails
   *  @see #getPageContent
   */
  public Edit edit(String pagetitle, String text, String summary) throws Exception;
	
	/**
	 * are exceptions thrown when an api error code is received?
	 * @return the throwExceptionOnError
	 */
	public boolean isThrowExceptionOnError();

	/**
	 * set to true if exceptions should be thrown when api error codes are received
	 * default is true
	 * @param throwExceptionOnError the throwExceptionOnError to set
	 */
	public void setThrowExceptionOnError(boolean throwExceptionOnError);
	
	/**
	 * get an ISO time stamp (utility function)
	 * FIXME may have to move out of the main API
	 * @return
	 */
	public String getIsoTimeStamp();
	
	/**
	 * set the debug mode
	 * @param pDebug
	 */
	public void setDebug(boolean pDebug);
	
	/**
	 * get the state of the debug mode
	 * @return - true if debugging is activated
	 * @return
	 */
	public boolean isDebug();
}