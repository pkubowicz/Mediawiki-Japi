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

import java.io.File;

import com.bitplan.mediawiki.japi.api.Edit;
import com.bitplan.mediawiki.japi.api.General;
import com.bitplan.mediawiki.japi.api.Login;

/**
 * Mediawiki API Interface see <a
 * href="https://www.mediawiki.org/wiki/API:Main_page"
 * >https://www.mediawiki.org/wiki/API:Main_page</a>
 * 
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
   * 
   * @param siteurl
   * @throws Exception
   *           - if the url is not o.k.
   */
  public void setSiteurl(String siteurl) throws Exception;
  
  /**
   * set the scriptPath of this Wiki
   * @param scriptPath - the scriptPath to set
   */
  public void setScriptPath(String scriptPath);
  
  /**
   * get the script Path
   * @return
   */
  public String getScriptPath();

  /**
   * get the Version of this Mediawiki
   * 
   * @return the the version string
   * @throws Exception
   */
  public String getVersion() throws Exception;

  /**
   * get the general siteinfo
   * 
   * @return the siteinfo
   * @throws Exception
   */
  public General getSiteInfo() throws Exception;
  
  /**
   * overrideable method to do pre setup stuff
   * @param siteurl - the url to use
   * @param scriptPath - the script path to use
   * @throws Exception
   */
  public void init(String siteurl, String scriptPath) throws Exception;

  /**
   * login the given user with the given password
   * 
   * See <a href="https://www.mediawiki.org/wiki/API:Login">API:Login</a>
   * 
   * @param username
   * @param password
   * @return the Login information as returned by the API
   * @throws Exception
   * @since 0.0.1
   */
  public Login login(String username, String password) throws Exception;

  /**
   * 
   * Log the current user out See <a
   * href="https://www.mediawiki.org/wiki/API:Logout">API:Logout</a>
   * 
   * @throws Exception
   * @since 0.0.1
   */
  public void logout() throws Exception;

  /**
   * get the page Content for the given page Title
   * 
   * @param pageTitle
   * @return the content of the page
   * @throws Exception
   * @since 0.0.1
   */
  public String getPageContent(String pageTitle) throws Exception;

  /**
   * Edits a page by setting its text to the supplied value.
   *
   * @param text
   *          the text of the page
   * @param pagetitle
   *          the title of the page
   * @param summary
   *          the edit summary. Summaries longer than 200 characters are
   *          truncated server-side.
   * @return the edit stage as a wrapped Edit API response
   * @throws Exception
   *           - if the edit fails
   * @see #getPageContent
   * @since 0.0.1
   */
  public Edit edit(String pagetitle, String text, String summary)
      throws Exception;

  /**
   * Uploads an image. Equivalent to [[Special:Upload]].
   * 
   * @param file
   *          the image file
   * @param filename
   *          the target file name (may contain File)
   * @param contents
   *          the contents of the image description page, set to "" if
   *          overwriting an existing file
   * @param reason
   *          an upload summary (defaults to <tt>contents</tt>, use "" to not
   *          specify one)
   * @throws Exception
   *           - if the upload fails
   * @since 0.0.3
   */
  public void upload(File file, String filename, String contents, String reason)
      throws Exception;
  
  /**
   * copy the page for a given title from this wiki to the given target Wiki
   * uses https://www.mediawiki.org/wiki/API:Edit FIXME - make this an API
   * interface function FIXME - create a multi title version
   * 
   * @param targetWiki
   *          - the other wiki (could use a different API implementation ...)
   * @param pageTitle
   *          - the title of the page to copy
   * @param summary
   *          - the summary to use
   * @return - the Edit result
   * @throws Exception
   */
  public Edit copyToWiki(MediawikiApi targetWiki, String pageTitle,
      String summary) throws Exception;
  
  /**
   * are exceptions thrown when an api error code is received?
   * 
   * @return the throwExceptionOnError
   */
  public boolean isThrowExceptionOnError();

  /**
   * set to true if exceptions should be thrown when api error codes are
   * received default is true
   * 
   * @param throwExceptionOnError
   *          the throwExceptionOnError to set
   */
  public void setThrowExceptionOnError(boolean throwExceptionOnError);

  /**
   * get an ISO time stamp (utility function) FIXME may have to move out of the
   * main API
   * 
   * @return
   */
  public String getIsoTimeStamp();

  /**
   * set the debug mode
   * 
   * @param pDebug
   */
  public void setDebug(boolean pDebug);

  /**
   * get the state of the debug mode
   * 
   * @return - true if debugging is activated
   * @return
   */
  public boolean isDebug();

  
}
