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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alias to delete. The name is case sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * The name of the alias to delete. The name is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the alias to delete. The name is case sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alias to delete. The name is case sensitive.
     * </p>
     * 
     * @return The name of the alias to delete. The name is case sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alias to delete. The name is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the alias to delete. The name is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * 
     * @param botName
     *        The name of the bot that the alias points to.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * 
     * @return The name of the bot that the alias points to.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot that the alias points to.
     * </p>
     * 
     * @param botName
     *        The name of the bot that the alias points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotAliasRequest withBotName(String botName) {
        setBotName(botName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotAliasRequest == false)
            return false;
        DeleteBotAliasRequest other = (DeleteBotAliasRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotAliasRequest clone() {
        return (DeleteBotAliasRequest) super.clone();
    }

}
