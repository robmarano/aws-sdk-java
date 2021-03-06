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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The custom parameters to be used when the target is an Amazon ECS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/EcsParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     * </p>
     */
    private Integer taskCount;

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * </p>
     * 
     * @return The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     * </p>
     * 
     * @param taskCount
     *        The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     */

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    /**
     * <p>
     * The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     * </p>
     * 
     * @return The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     */

    public Integer getTaskCount() {
        return this.taskCount;
    }

    /**
     * <p>
     * The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     * </p>
     * 
     * @param taskCount
     *        The number of tasks to create based on the <code>TaskDefinition</code>. The default is one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTaskCount(Integer taskCount) {
        setTaskCount(taskCount);
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
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn()).append(",");
        if (getTaskCount() != null)
            sb.append("TaskCount: ").append(getTaskCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsParameters == false)
            return false;
        EcsParameters other = (EcsParameters) obj;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getTaskCount() == null ^ this.getTaskCount() == null)
            return false;
        if (other.getTaskCount() != null && other.getTaskCount().equals(this.getTaskCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getTaskCount() == null) ? 0 : getTaskCount().hashCode());
        return hashCode;
    }

    @Override
    public EcsParameters clone() {
        try {
            return (EcsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.EcsParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
