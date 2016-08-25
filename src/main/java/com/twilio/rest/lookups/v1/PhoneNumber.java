/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.lookups.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhoneNumber extends Resource {
    private static final long serialVersionUID = 23007963816035L;

    public enum Type {
        LANDLINE("landline"),
        MOBILE("mobile"),
        VOIP("voip");
    
        private final String value;
        
        private Type(final String value) {
            this.value = value;
        }
        
        public String toString() {
            return value;
        }
        
        /**
         * Generate a Type from a string.
         * @param value string value
         * @return generated Type
         */
        @JsonCreator
        public static Type forValue(final String value) {
            String normalized = value.replace("-", "_").toUpperCase();
            try {
                return Type.valueOf(normalized);
            } catch (RuntimeException e) {
        
                // Don't blow up of value does not exist
                return null;
            }
        }
    }

    /**
     * Create a PhoneNumberFetcher to execute fetch.
     * 
     * @param phoneNumber The phone_number
     * @return PhoneNumberFetcher capable of executing the fetch
     */
    public static PhoneNumberFetcher fetch(final com.twilio.type.PhoneNumber phoneNumber) {
        return new PhoneNumberFetcher(phoneNumber);
    }

    /**
     * Converts a JSON String into a PhoneNumber object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PhoneNumber object represented by the provided JSON
     */
    public static PhoneNumber fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PhoneNumber object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PhoneNumber object represented by the provided JSON
     */
    public static PhoneNumber fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PhoneNumber.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final Map<String, String> callerName;
    private final String countryCode;
    private final com.twilio.type.PhoneNumber phoneNumber;
    private final String nationalFormat;
    private final Map<String, String> carrier;
    private final Map<String, Object> addOns;

    @JsonCreator
    private PhoneNumber(@JsonProperty("caller_name")
                        final Map<String, String> callerName, 
                        @JsonProperty("country_code")
                        final String countryCode, 
                        @JsonProperty("phone_number")
                        final com.twilio.type.PhoneNumber phoneNumber, 
                        @JsonProperty("national_format")
                        final String nationalFormat, 
                        @JsonProperty("carrier")
                        final Map<String, String> carrier, 
                        @JsonProperty("add_ons")
                        final Map<String, Object> addOns) {
        this.callerName = callerName;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.nationalFormat = nationalFormat;
        this.carrier = carrier;
        this.addOns = addOns;
    }

    /**
     * Returns The The phone_number.
     * 
     * @return The phone_number
     */
    public final String getSid() {
        return this.getPhoneNumber().toString();
    }

    /**
     * Returns The The caller_name.
     * 
     * @return The caller_name
     */
    public final Map<String, String> getCallerName() {
        return this.callerName;
    }

    /**
     * Returns The The country_code.
     * 
     * @return The country_code
     */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Returns The The phone_number.
     * 
     * @return The phone_number
     */
    public final com.twilio.type.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Returns The The national_format.
     * 
     * @return The national_format
     */
    public final String getNationalFormat() {
        return this.nationalFormat;
    }

    /**
     * Returns The The carrier.
     * 
     * @return The carrier
     */
    public final Map<String, String> getCarrier() {
        return this.carrier;
    }

    /**
     * Returns The The add_ons.
     * 
     * @return The add_ons
     */
    public final Map<String, Object> getAddOns() {
        return this.addOns;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        PhoneNumber other = (PhoneNumber) o;
        
        return Objects.equals(callerName, other.callerName) && 
               Objects.equals(countryCode, other.countryCode) && 
               Objects.equals(phoneNumber, other.phoneNumber) && 
               Objects.equals(nationalFormat, other.nationalFormat) && 
               Objects.equals(carrier, other.carrier) && 
               Objects.equals(addOns, other.addOns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerName,
                            countryCode,
                            phoneNumber,
                            nationalFormat,
                            carrier,
                            addOns);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("callerName", callerName)
                          .add("countryCode", countryCode)
                          .add("phoneNumber", phoneNumber)
                          .add("nationalFormat", nationalFormat)
                          .add("carrier", carrier)
                          .add("addOns", addOns)
                          .toString();
    }
}