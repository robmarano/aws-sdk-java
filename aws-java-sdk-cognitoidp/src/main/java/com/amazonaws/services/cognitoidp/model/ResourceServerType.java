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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for information about a resource server for a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResourceServerType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceServerType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID for the user pool that hosts the resource server.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The identifier for the resource server.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name of the resource server.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of scopes that are defined for the resource server.
     * </p>
     */
    private java.util.List<ResourceServerScopeType> scopes;

    /**
     * <p>
     * The user pool ID for the user pool that hosts the resource server.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that hosts the resource server.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that hosts the resource server.
     * </p>
     * 
     * @return The user pool ID for the user pool that hosts the resource server.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that hosts the resource server.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that hosts the resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The identifier for the resource server.
     * </p>
     * 
     * @param identifier
     *        The identifier for the resource server.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier for the resource server.
     * </p>
     * 
     * @return The identifier for the resource server.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier for the resource server.
     * </p>
     * 
     * @param identifier
     *        The identifier for the resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerType withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name of the resource server.
     * </p>
     * 
     * @param name
     *        The name of the resource server.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource server.
     * </p>
     * 
     * @return The name of the resource server.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource server.
     * </p>
     * 
     * @param name
     *        The name of the resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of scopes that are defined for the resource server.
     * </p>
     * 
     * @return A list of scopes that are defined for the resource server.
     */

    public java.util.List<ResourceServerScopeType> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * A list of scopes that are defined for the resource server.
     * </p>
     * 
     * @param scopes
     *        A list of scopes that are defined for the resource server.
     */

    public void setScopes(java.util.Collection<ResourceServerScopeType> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<ResourceServerScopeType>(scopes);
    }

    /**
     * <p>
     * A list of scopes that are defined for the resource server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        A list of scopes that are defined for the resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerType withScopes(ResourceServerScopeType... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<ResourceServerScopeType>(scopes.length));
        }
        for (ResourceServerScopeType ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scopes that are defined for the resource server.
     * </p>
     * 
     * @param scopes
     *        A list of scopes that are defined for the resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerType withScopes(java.util.Collection<ResourceServerScopeType> scopes) {
        setScopes(scopes);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceServerType == false)
            return false;
        ResourceServerType other = (ResourceServerType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        return hashCode;
    }

    @Override
    public ResourceServerType clone() {
        try {
            return (ResourceServerType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.ResourceServerTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
