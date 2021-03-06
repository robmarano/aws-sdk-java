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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Caption Description for preset
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionDescriptionPreset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDescriptionPreset implements Serializable, Cloneable, StructuredPojo {

    private CaptionDestinationSettings destinationSettings;
    /** Indicates the language of the caption output track. */
    private String languageCode;
    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     */
    private String languageDescription;

    /**
     * @param destinationSettings
     */

    public void setDestinationSettings(CaptionDestinationSettings destinationSettings) {
        this.destinationSettings = destinationSettings;
    }

    /**
     * @return
     */

    public CaptionDestinationSettings getDestinationSettings() {
        return this.destinationSettings;
    }

    /**
     * @param destinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescriptionPreset withDestinationSettings(CaptionDestinationSettings destinationSettings) {
        setDestinationSettings(destinationSettings);
        return this;
    }

    /**
     * Indicates the language of the caption output track.
     * 
     * @param languageCode
     *        Indicates the language of the caption output track.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Indicates the language of the caption output track.
     * 
     * @return Indicates the language of the caption output track.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Indicates the language of the caption output track.
     * 
     * @param languageCode
     *        Indicates the language of the caption output track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionDescriptionPreset withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Indicates the language of the caption output track.
     * 
     * @param languageCode
     *        Indicates the language of the caption output track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionDescriptionPreset withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     * 
     * @param languageDescription
     *        Human readable information to indicate captions available for players (eg. English, or Spanish).
     *        Alphanumeric characters, spaces, and underscore are legal.
     */

    public void setLanguageDescription(String languageDescription) {
        this.languageDescription = languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     * 
     * @return Human readable information to indicate captions available for players (eg. English, or Spanish).
     *         Alphanumeric characters, spaces, and underscore are legal.
     */

    public String getLanguageDescription() {
        return this.languageDescription;
    }

    /**
     * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric
     * characters, spaces, and underscore are legal.
     * 
     * @param languageDescription
     *        Human readable information to indicate captions available for players (eg. English, or Spanish).
     *        Alphanumeric characters, spaces, and underscore are legal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDescriptionPreset withLanguageDescription(String languageDescription) {
        setLanguageDescription(languageDescription);
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
        if (getDestinationSettings() != null)
            sb.append("DestinationSettings: ").append(getDestinationSettings()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLanguageDescription() != null)
            sb.append("LanguageDescription: ").append(getLanguageDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDescriptionPreset == false)
            return false;
        CaptionDescriptionPreset other = (CaptionDescriptionPreset) obj;
        if (other.getDestinationSettings() == null ^ this.getDestinationSettings() == null)
            return false;
        if (other.getDestinationSettings() != null && other.getDestinationSettings().equals(this.getDestinationSettings()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageDescription() == null ^ this.getLanguageDescription() == null)
            return false;
        if (other.getLanguageDescription() != null && other.getLanguageDescription().equals(this.getLanguageDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationSettings() == null) ? 0 : getDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageDescription() == null) ? 0 : getLanguageDescription().hashCode());
        return hashCode;
    }

    @Override
    public CaptionDescriptionPreset clone() {
        try {
            return (CaptionDescriptionPreset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionDescriptionPresetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
