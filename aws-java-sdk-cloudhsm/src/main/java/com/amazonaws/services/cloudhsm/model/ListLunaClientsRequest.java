/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListLunaClients" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLunaClientsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this is the
     * first call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this is the
     * first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this
     *        is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this is the
     * first call.
     * </p>
     * 
     * @return The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this
     *         is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this is the
     * first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to <code>ListLunaClients</code>. Pass null if this
     *        is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLunaClientsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLunaClientsRequest == false)
            return false;
        ListLunaClientsRequest other = (ListLunaClientsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLunaClientsRequest clone() {
        return (ListLunaClientsRequest) super.clone();
    }

}
