/*
 * #%L
 * Wildfly Camel
 * %%
 * Copyright (C) 2013 - 2015 RedHat
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.test;

import org.apache.camel.Exchange;

public class MyBean {

    public String sayHello(Exchange exchange) {
    	System.out.println("inside123");
    	String response= "<prof:getCustomerDiscountResponse xmlns:prof=\"http://org.jboss.ws/samples/retail/profile\">"+
        "<customer>"+
           "<creditCardDetails>5555</creditCardDetails>"+
           "<firstName>Rname</firstName>"+
           "<lastName>RLname</lastName>"+
        "</customer>"+
        "<discount>423</discount>"+
     "</prof:getCustomerDiscountResponse>";
    	
        return response;
    }
}
