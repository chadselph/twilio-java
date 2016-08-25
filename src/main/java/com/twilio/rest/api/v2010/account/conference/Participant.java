/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.api.v2010.account.conference;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Participant extends Resource {
    private static final long serialVersionUID = 177171582152744L;

    /**
     * Create a ParticipantFetcher to execute fetch.
     * 
     * @param accountSid The account_sid
     * @param conferenceSid The string that uniquely identifies this conference
     * @param callSid The call_sid
     * @return ParticipantFetcher capable of executing the fetch
     */
    public static ParticipantFetcher fetch(final String accountSid, 
                                           final String conferenceSid, 
                                           final String callSid) {
        return new ParticipantFetcher(accountSid, conferenceSid, callSid);
    }

    /**
     * Create a ParticipantFetcher to execute fetch.
     * 
     * @param conferenceSid The string that uniquely identifies this conference
     * @param callSid The call_sid
     * @return ParticipantFetcher capable of executing the fetch
     */
    public static ParticipantFetcher fetch(final String conferenceSid, 
                                           final String callSid) {
        return new ParticipantFetcher(conferenceSid, callSid);
    }

    /**
     * Create a ParticipantUpdater to execute update.
     * 
     * @param accountSid The account_sid
     * @param conferenceSid The string that uniquely identifies this conference
     * @param callSid The call_sid
     * @return ParticipantUpdater capable of executing the update
     */
    public static ParticipantUpdater update(final String accountSid, 
                                            final String conferenceSid, 
                                            final String callSid) {
        return new ParticipantUpdater(accountSid, conferenceSid, callSid);
    }

    /**
     * Create a ParticipantUpdater to execute update.
     * 
     * @param conferenceSid The string that uniquely identifies this conference
     * @param callSid The call_sid
     * @return ParticipantUpdater capable of executing the update
     */
    public static ParticipantUpdater update(final String conferenceSid, 
                                            final String callSid) {
        return new ParticipantUpdater(conferenceSid, callSid);
    }

    /**
     * Create a ParticipantDeleter to execute delete.
     * 
     * @param accountSid The account_sid
     * @param conferenceSid The string that uniquely identifies this conference
     * @param callSid The call_sid
     * @return ParticipantDeleter capable of executing the delete
     */
    public static ParticipantDeleter delete(final String accountSid, 
                                            final String conferenceSid, 
                                            final String callSid) {
        return new ParticipantDeleter(accountSid, conferenceSid, callSid);
    }

    /**
     * Create a ParticipantDeleter to execute delete.
     * 
     * @param conferenceSid The string that uniquely identifies this conference
     * @param callSid The call_sid
     * @return ParticipantDeleter capable of executing the delete
     */
    public static ParticipantDeleter delete(final String conferenceSid, 
                                            final String callSid) {
        return new ParticipantDeleter(conferenceSid, callSid);
    }

    /**
     * Create a ParticipantReader to execute read.
     * 
     * @param accountSid The account_sid
     * @param conferenceSid The string that uniquely identifies this conference
     * @return ParticipantReader capable of executing the read
     */
    public static ParticipantReader read(final String accountSid, 
                                         final String conferenceSid) {
        return new ParticipantReader(accountSid, conferenceSid);
    }

    /**
     * Create a ParticipantReader to execute read.
     * 
     * @param conferenceSid The string that uniquely identifies this conference
     * @return ParticipantReader capable of executing the read
     */
    public static ParticipantReader read(final String conferenceSid) {
        return new ParticipantReader(conferenceSid);
    }

    /**
     * Converts a JSON String into a Participant object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Participant object represented by the provided JSON
     */
    public static Participant fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Participant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Participant object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Participant object represented by the provided JSON
     */
    public static Participant fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Participant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String callSid;
    private final String conferenceSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final Boolean endConferenceOnExit;
    private final Boolean muted;
    private final Boolean hold;
    private final Boolean startConferenceOnEnter;
    private final String uri;

    @JsonCreator
    private Participant(@JsonProperty("account_sid")
                        final String accountSid, 
                        @JsonProperty("call_sid")
                        final String callSid, 
                        @JsonProperty("conference_sid")
                        final String conferenceSid, 
                        @JsonProperty("date_created")
                        final String dateCreated, 
                        @JsonProperty("date_updated")
                        final String dateUpdated, 
                        @JsonProperty("end_conference_on_exit")
                        final Boolean endConferenceOnExit, 
                        @JsonProperty("muted")
                        final Boolean muted, 
                        @JsonProperty("hold")
                        final Boolean hold, 
                        @JsonProperty("start_conference_on_enter")
                        final Boolean startConferenceOnEnter, 
                        @JsonProperty("uri")
                        final String uri) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.conferenceSid = conferenceSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.endConferenceOnExit = endConferenceOnExit;
        this.muted = muted;
        this.hold = hold;
        this.startConferenceOnEnter = startConferenceOnEnter;
        this.uri = uri;
    }

    /**
     * Returns The A string that uniquely identifies this call.
     * 
     * @return A string that uniquely identifies this call
     */
    public final String getSid() {
        return this.getCallSid();
    }

    /**
     * Returns The The unique sid that identifies this account.
     * 
     * @return The unique sid that identifies this account
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The A string that uniquely identifies this call.
     * 
     * @return A string that uniquely identifies this call
     */
    public final String getCallSid() {
        return this.callSid;
    }

    /**
     * Returns The A string that uniquely identifies this conference.
     * 
     * @return A string that uniquely identifies this conference
     */
    public final String getConferenceSid() {
        return this.conferenceSid;
    }

    /**
     * Returns The The date this resource was created.
     * 
     * @return The date this resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this resource was last updated.
     * 
     * @return The date this resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The Indicates if the endConferenceOnExit was set.
     * 
     * @return Indicates if the endConferenceOnExit was set
     */
    public final Boolean getEndConferenceOnExit() {
        return this.endConferenceOnExit;
    }

    /**
     * Returns The Indicates if the participant is muted.
     * 
     * @return Indicates if the participant is muted
     */
    public final Boolean getMuted() {
        return this.muted;
    }

    /**
     * Returns The The hold.
     * 
     * @return The hold
     */
    public final Boolean getHold() {
        return this.hold;
    }

    /**
     * Returns The Indicates if the startConferenceOnEnter attribute was set.
     * 
     * @return Indicates if the startConferenceOnEnter attribute was set
     */
    public final Boolean getStartConferenceOnEnter() {
        return this.startConferenceOnEnter;
    }

    /**
     * Returns The The URI for this resource.
     * 
     * @return The URI for this resource
     */
    public final String getUri() {
        return this.uri;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Participant other = (Participant) o;
        
        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(callSid, other.callSid) && 
               Objects.equals(conferenceSid, other.conferenceSid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(endConferenceOnExit, other.endConferenceOnExit) && 
               Objects.equals(muted, other.muted) && 
               Objects.equals(hold, other.hold) && 
               Objects.equals(startConferenceOnEnter, other.startConferenceOnEnter) && 
               Objects.equals(uri, other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            callSid,
                            conferenceSid,
                            dateCreated,
                            dateUpdated,
                            endConferenceOnExit,
                            muted,
                            hold,
                            startConferenceOnEnter,
                            uri);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("callSid", callSid)
                          .add("conferenceSid", conferenceSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("endConferenceOnExit", endConferenceOnExit)
                          .add("muted", muted)
                          .add("hold", hold)
                          .add("startConferenceOnEnter", startConferenceOnEnter)
                          .add("uri", uri)
                          .toString();
    }
}