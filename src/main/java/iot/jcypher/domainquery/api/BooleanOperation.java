/************************************************************************
 * Copyright (c) 2014 IoT-Solutions e.U.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ************************************************************************/

package iot.jcypher.domainquery.api;

import iot.jcypher.domainquery.ast.PredicateExpression;

public class BooleanOperation extends APIObject {

	public BooleanOperation(PredicateExpression pe) {
		this.astObject = pe;
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>test for equality</i></div>
	 * <br/>
	 */
	public <E> void EQUALS(E value) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>negate</i></div>
	 * <br/>
	 */
	public BooleanOperation NOT() {
		getPredicateExpression().addNegation();
		return this;
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>less than</i></div>
	 * <br/>
	 */
	public <E> void LT(E value) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>less than or equal</i></div>
	 * <br/>
	 */
	public <E> void LTE(E value) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>greater than</i></div>
	 * <br/>
	 */
	public <E> void GT(E value) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>greater than or equal</i></div>
	 * <br/>
	 */
	public <E> void GTE(E value) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>test against a regular expression</i></div>
	 * <br/>
	 */
	public void LIKE(String regex) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>test against NULL (test if a property exists)</i></div>
	 * <br/>
	 */
	public void IS_NULL() {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>test for containment in a list of elements</i></div>
	 * <br/>
	 */
	@SuppressWarnings("unchecked")
	public <E> void IN_list(E... value) {
	}
	
	/**
	 * <div color='red' style="font-size:24px;color:red"><b><i><u>JCYPHER</u></i></b></div>
	 * <div color='red' style="font-size:18px;color:red"><i>test for containment in a list of matched domain objects</i></div>
	 * <br/>
	 */
	public <E> void IN(DomainObjectMatch<E> domainObjects) {
	}
	
	private PredicateExpression getPredicateExpression() {
		return (PredicateExpression) this.astObject;
	}
}