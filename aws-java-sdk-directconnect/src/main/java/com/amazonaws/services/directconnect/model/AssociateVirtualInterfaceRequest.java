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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the AssociateVirtualInterface operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateVirtualInterfaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Example: dxvif-123dfg56
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * The ID of the LAG or connection with which to associate the virtual interface.
     * </p>
     * <p>
     * Example: dxlag-abc123 or dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Example: dxvif-123dfg56
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface.</p>
     *        <p>
     *        Example: dxvif-123dfg56
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Example: dxvif-123dfg56
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the virtual interface.</p>
     *         <p>
     *         Example: dxvif-123dfg56
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface.
     * </p>
     * <p>
     * Example: dxvif-123dfg56
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface.</p>
     *        <p>
     *        Example: dxvif-123dfg56
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVirtualInterfaceRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the LAG or connection with which to associate the virtual interface.
     * </p>
     * <p>
     * Example: dxlag-abc123 or dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of the LAG or connection with which to associate the virtual interface.</p>
     *        <p>
     *        Example: dxlag-abc123 or dxcon-abc123
     *        </p>
     *        <p>
     *        Default: None
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the LAG or connection with which to associate the virtual interface.
     * </p>
     * <p>
     * Example: dxlag-abc123 or dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @return The ID of the LAG or connection with which to associate the virtual interface.</p>
     *         <p>
     *         Example: dxlag-abc123 or dxcon-abc123
     *         </p>
     *         <p>
     *         Default: None
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the LAG or connection with which to associate the virtual interface.
     * </p>
     * <p>
     * Example: dxlag-abc123 or dxcon-abc123
     * </p>
     * <p>
     * Default: None
     * </p>
     * 
     * @param connectionId
     *        The ID of the LAG or connection with which to associate the virtual interface.</p>
     *        <p>
     *        Example: dxlag-abc123 or dxcon-abc123
     *        </p>
     *        <p>
     *        Default: None
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVirtualInterfaceRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
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
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVirtualInterfaceRequest == false)
            return false;
        AssociateVirtualInterfaceRequest other = (AssociateVirtualInterfaceRequest) obj;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateVirtualInterfaceRequest clone() {
        return (AssociateVirtualInterfaceRequest) super.clone();
    }

}
