
package com.ericsson.eiffel.semantics.events;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EiffelArtifactCreatedEvent
    extends Event
{

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("meta")
    @Expose
    private EiffelArtifactCreatedEventMeta meta;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("data")
    @Expose
    private EiffelArtifactCreatedEventData data;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();

    /**
     * 
     * (Required)
     * 
     */
    public EiffelArtifactCreatedEventMeta getMeta() {
        return meta;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setMeta(EiffelArtifactCreatedEventMeta meta) {
        this.meta = meta;
    }

    /**
     * 
     * (Required)
     * 
     */
    public EiffelArtifactCreatedEventData getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setData(EiffelArtifactCreatedEventData data) {
        this.data = data;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

}