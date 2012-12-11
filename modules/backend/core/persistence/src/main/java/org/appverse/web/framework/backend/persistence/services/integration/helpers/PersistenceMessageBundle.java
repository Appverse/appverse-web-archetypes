/*
 Copyright (c) 2012 GFT Appverse, S.L., Sociedad Unipersonal.

 This Source Code Form is subject to the terms of the Appverse Public License 
 Version 2.0 (“APL v2.0”). If a copy of the APL was not distributed with this 
 file, You can obtain one at http://www.appverse.mobi/licenses/apl_v2.0.pdf. [^]

 Redistribution and use in source and binary forms, with or without modification, 
 are permitted provided that the conditions of the AppVerse Public License v2.0 
 are met.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. EXCEPT IN CASE OF WILLFUL MISCONDUCT OR GROSS NEGLIGENCE, IN NO EVENT
 SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT(INCLUDING NEGLIGENCE OR OTHERWISE) 
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 POSSIBILITY OF SUCH DAMAGE.
 */
package org.appverse.web.framework.backend.persistence.services.integration.helpers;

public class PersistenceMessageBundle {

	public static final String MSG_DAO_RETRIEVEBYBEAN = "Error retrieving bean by Id fieldName ";
	public static final String MSG_DAO_RETRIEVEBYBEAN_ERROR_P1 = "Error retrieving bean by Id fieldName {0}";
	public static final String MSG_DAO_RETRIEVEBYBEAN_ERROR_P2 = "Executing retrieveByBean for {0} with PK field {1}";
	public static final String MSG_DAO_PERSIST = "Executing persist.";
	public static final String MSG_DAO_REFRESH = "Executing refresh.";
	public static final String MSG_DAO_PERSIST_IDNOTFOUND = "Persist PK with name 'id' does not exist.";
	public static final String MSG_DAO_REMOVE = "Executing remove.";
	public static final String MSG_DAO_FLUSH = "Executing flush.";
	public static final String MSG_DAO_REMOVEALL = "Executing deleteAll for {0}";
	public static final String MSG_DAO_COUNTALL = "Executing countAll for {0}";
	public static final String MSG_DAO_RETRIEVEALL = "Executing retrieveAll for {0}";
	public static final String MSG_DAO_RETRIEVEBY = "Executing retrieveByPk for {0}";
	public static final String MSG_DAO_RETRIEVEBY_ERROR_PARAMETERPATTERN = "{0} does not adhere to parameterized pattern.";
	public static final String MSG_DAO_RETRIEVEBY_ERROR_PARAMETERTYPE = "{0} does not have a simple parameterized type.";
	public static final String MSG_DAO_RETRIEVEFILTERED = "Executing retrieveByFilter for {0} with filter {1}";
	public static final String MSG_DAO_RETRIEVEFILTERED_ERROR = "Error retrieving filtered {0} with class {1}";
	public static final String MSG_DAO_RETRIEVEFILTERED_ERROR_P1 = "Error retrieving filtered ";
	public static final String MSG_DAO_RETRIEVEFILTERED_ERROR_P2 = " with class ";

	public static final String MSG_MOCK_ENTITYMANAGER = "Setting EntityManagerFactory: {0} (Could be null in MOCK class)";
	public static final String MSG_MOCK_ERRORBEANPOPULATE = "Failed to populate mock data.";
	public static final String MSG_MOCK_ERRORBEANPOPULATE_EXCEPTION = "Mock service could not populate bean with mock data.";
	public static final String MSG_MOCK_PERSIST = "Executing persist for {0}";
	public static final String MSG_MOCK_REFRESH = "Executing refresh  for {0}.";
	public static final String MSG_MOCK_REMOVE = "Executing remove for {0}";
	public static final String MSG_MOCK_REMOVEALL = "Executing deleteAll for {0}";
	public static final String MSG_MOCK_RETRIEVEALL = "Executing retrieveAll for {0}";
	public static final String MSG_MOCK_RETRIEVEBYBEAN = "Executing retrieveByBean for {0} with PK field name {1}";
	public static final String MSG_MOCK_RETRIEVEBYID = "Executing retrieveByPk for {0}";
	public static final String MSG_MOCK_RETRIEVEFILTERED = "Executing retrieveByFilterfor {0} with filter {1}";
	public static final int MOCK_LISTSIZE = 50;
}
