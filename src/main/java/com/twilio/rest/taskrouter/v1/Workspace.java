/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.taskrouter.v1;

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
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Workspace extends Resource {
    private static final long serialVersionUID = 151366087577659L;

    /**
     * Create a WorkspaceFetcher to execute fetch.
     * 
     * @param sid The sid
     * @return WorkspaceFetcher capable of executing the fetch
     */
    public static WorkspaceFetcher fetch(final String sid) {
        return new WorkspaceFetcher(sid);
    }

    /**
     * Create a WorkspaceUpdater to execute update.
     * 
     * @param sid The sid
     * @return WorkspaceUpdater capable of executing the update
     */
    public static WorkspaceUpdater update(final String sid) {
        return new WorkspaceUpdater(sid);
    }

    /**
     * Create a WorkspaceReader to execute read.
     * 
     * @return WorkspaceReader capable of executing the read
     */
    public static WorkspaceReader read() {
        return new WorkspaceReader();
    }

    /**
     * Create a WorkspaceCreator to execute create.
     * 
     * @param friendlyName The friendly_name
     * @return WorkspaceCreator capable of executing the create
     */
    public static WorkspaceCreator create(final String friendlyName) {
        return new WorkspaceCreator(friendlyName);
    }

    /**
     * Create a WorkspaceDeleter to execute delete.
     * 
     * @param sid The sid
     * @return WorkspaceDeleter capable of executing the delete
     */
    public static WorkspaceDeleter delete(final String sid) {
        return new WorkspaceDeleter(sid);
    }

    /**
     * Converts a JSON String into a Workspace object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Workspace object represented by the provided JSON
     */
    public static Workspace fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workspace.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Workspace object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Workspace object represented by the provided JSON
     */
    public static Workspace fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workspace.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String defaultActivityName;
    private final String defaultActivitySid;
    private final URI eventCallbackUrl;
    private final String eventsFilter;
    private final String friendlyName;
    private final Boolean multiTaskEnabled;
    private final String sid;
    private final String timeoutActivityName;
    private final String timeoutActivitySid;

    @JsonCreator
    private Workspace(@JsonProperty("account_sid")
                      final String accountSid, 
                      @JsonProperty("date_created")
                      final String dateCreated, 
                      @JsonProperty("date_updated")
                      final String dateUpdated, 
                      @JsonProperty("default_activity_name")
                      final String defaultActivityName, 
                      @JsonProperty("default_activity_sid")
                      final String defaultActivitySid, 
                      @JsonProperty("event_callback_url")
                      final URI eventCallbackUrl, 
                      @JsonProperty("events_filter")
                      final String eventsFilter, 
                      @JsonProperty("friendly_name")
                      final String friendlyName, 
                      @JsonProperty("multi_task_enabled")
                      final Boolean multiTaskEnabled, 
                      @JsonProperty("sid")
                      final String sid, 
                      @JsonProperty("timeout_activity_name")
                      final String timeoutActivityName, 
                      @JsonProperty("timeout_activity_sid")
                      final String timeoutActivitySid) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.defaultActivityName = defaultActivityName;
        this.defaultActivitySid = defaultActivitySid;
        this.eventCallbackUrl = eventCallbackUrl;
        this.eventsFilter = eventsFilter;
        this.friendlyName = friendlyName;
        this.multiTaskEnabled = multiTaskEnabled;
        this.sid = sid;
        this.timeoutActivityName = timeoutActivityName;
        this.timeoutActivitySid = timeoutActivitySid;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The default_activity_name.
     * 
     * @return The default_activity_name
     */
    public final String getDefaultActivityName() {
        return this.defaultActivityName;
    }

    /**
     * Returns The The default_activity_sid.
     * 
     * @return The default_activity_sid
     */
    public final String getDefaultActivitySid() {
        return this.defaultActivitySid;
    }

    /**
     * Returns The The event_callback_url.
     * 
     * @return The event_callback_url
     */
    public final URI getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    /**
     * Returns The The events_filter.
     * 
     * @return The events_filter
     */
    public final String getEventsFilter() {
        return this.eventsFilter;
    }

    /**
     * Returns The The friendly_name.
     * 
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The The multi_task_enabled.
     * 
     * @return The multi_task_enabled
     */
    public final Boolean getMultiTaskEnabled() {
        return this.multiTaskEnabled;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The timeout_activity_name.
     * 
     * @return The timeout_activity_name
     */
    public final String getTimeoutActivityName() {
        return this.timeoutActivityName;
    }

    /**
     * Returns The The timeout_activity_sid.
     * 
     * @return The timeout_activity_sid
     */
    public final String getTimeoutActivitySid() {
        return this.timeoutActivitySid;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Workspace other = (Workspace) o;
        
        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(defaultActivityName, other.defaultActivityName) && 
               Objects.equals(defaultActivitySid, other.defaultActivitySid) && 
               Objects.equals(eventCallbackUrl, other.eventCallbackUrl) && 
               Objects.equals(eventsFilter, other.eventsFilter) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(multiTaskEnabled, other.multiTaskEnabled) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(timeoutActivityName, other.timeoutActivityName) && 
               Objects.equals(timeoutActivitySid, other.timeoutActivitySid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            defaultActivityName,
                            defaultActivitySid,
                            eventCallbackUrl,
                            eventsFilter,
                            friendlyName,
                            multiTaskEnabled,
                            sid,
                            timeoutActivityName,
                            timeoutActivitySid);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("defaultActivityName", defaultActivityName)
                          .add("defaultActivitySid", defaultActivitySid)
                          .add("eventCallbackUrl", eventCallbackUrl)
                          .add("eventsFilter", eventsFilter)
                          .add("friendlyName", friendlyName)
                          .add("multiTaskEnabled", multiTaskEnabled)
                          .add("sid", sid)
                          .add("timeoutActivityName", timeoutActivityName)
                          .add("timeoutActivitySid", timeoutActivitySid)
                          .toString();
    }
}