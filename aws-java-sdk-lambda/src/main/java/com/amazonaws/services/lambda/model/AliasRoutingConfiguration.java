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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parent object that implements what percentage of traffic will invoke each function version. For more information,
 * see <a>lambda-traffic-shifting-using-aliases</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AliasRoutingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AliasRoutingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set this property value to dictate what percentage of traffic will invoke the updated function version. If set to
     * an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, Double> additionalVersionWeights;

    /**
     * <p>
     * Set this property value to dictate what percentage of traffic will invoke the updated function version. If set to
     * an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     * </p>
     * 
     * @return Set this property value to dictate what percentage of traffic will invoke the updated function version.
     *         If set to an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     */

    public java.util.Map<String, Double> getAdditionalVersionWeights() {
        if (additionalVersionWeights == null) {
            additionalVersionWeights = new com.amazonaws.internal.SdkInternalMap<String, Double>();
        }
        return additionalVersionWeights;
    }

    /**
     * <p>
     * Set this property value to dictate what percentage of traffic will invoke the updated function version. If set to
     * an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     * </p>
     * 
     * @param additionalVersionWeights
     *        Set this property value to dictate what percentage of traffic will invoke the updated function version. If
     *        set to an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     */

    public void setAdditionalVersionWeights(java.util.Map<String, Double> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights == null ? null : new com.amazonaws.internal.SdkInternalMap<String, Double>(
                additionalVersionWeights);
    }

    /**
     * <p>
     * Set this property value to dictate what percentage of traffic will invoke the updated function version. If set to
     * an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     * </p>
     * 
     * @param additionalVersionWeights
     *        Set this property value to dictate what percentage of traffic will invoke the updated function version. If
     *        set to an empty string, 100 percent of traffic will invoke <code>function-version</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasRoutingConfiguration withAdditionalVersionWeights(java.util.Map<String, Double> additionalVersionWeights) {
        setAdditionalVersionWeights(additionalVersionWeights);
        return this;
    }

    public AliasRoutingConfiguration addAdditionalVersionWeightsEntry(String key, Double value) {
        if (null == this.additionalVersionWeights) {
            this.additionalVersionWeights = new com.amazonaws.internal.SdkInternalMap<String, Double>();
        }
        if (this.additionalVersionWeights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalVersionWeights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalVersionWeights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasRoutingConfiguration clearAdditionalVersionWeightsEntries() {
        this.additionalVersionWeights = null;
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
        if (getAdditionalVersionWeights() != null)
            sb.append("AdditionalVersionWeights: ").append(getAdditionalVersionWeights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AliasRoutingConfiguration == false)
            return false;
        AliasRoutingConfiguration other = (AliasRoutingConfiguration) obj;
        if (other.getAdditionalVersionWeights() == null ^ this.getAdditionalVersionWeights() == null)
            return false;
        if (other.getAdditionalVersionWeights() != null && other.getAdditionalVersionWeights().equals(this.getAdditionalVersionWeights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalVersionWeights() == null) ? 0 : getAdditionalVersionWeights().hashCode());
        return hashCode;
    }

    @Override
    public AliasRoutingConfiguration clone() {
        try {
            return (AliasRoutingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.AliasRoutingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
