package com.demo.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Example {
    @SerializedName("meta")
    @Expose
    var meta: Meta? = null

    @SerializedName("response")
    @Expose
    var response: Response? = null

    inner class BeenHere {
        @SerializedName("count")
        @Expose
        var count: Int? = null

        @SerializedName("lastCheckinExpiredAt")
        @Expose
        var lastCheckinExpiredAt: Int? = null

        @SerializedName("marked")
        @Expose
        var marked: Boolean? = null

        @SerializedName("unconfirmedCount")
        @Expose
        var unconfirmedCount: Int? = null
    }

    inner class Category {
        @SerializedName("id")
        @Expose
        var id: String? = null

        @SerializedName("name")
        @Expose
        var name: String? = null

        @SerializedName("pluralName")
        @Expose
        var pluralName: String? = null

        @SerializedName("shortName")
        @Expose
        var shortName: String? = null

        @SerializedName("icon")
        @Expose
        var icon: Icon? = null

        @SerializedName("primary")
        @Expose
        var primary: Boolean? = null
    }

    inner class Contact
    inner class HereNow {
        @SerializedName("count")
        @Expose
        var count: Int? = null

        @SerializedName("summary")
        @Expose
        var summary: String? = null

        @SerializedName("groups")
        @Expose
        var groups: List<Any>? = null
    }

    inner class Icon {
        @SerializedName("prefix")
        @Expose
        var prefix: String? = null

        @SerializedName("suffix")
        @Expose
        var suffix: String? = null
    }

    inner class LabeledLatLng {
        @SerializedName("label")
        @Expose
        var label: String? = null

        @SerializedName("lat")
        @Expose
        var lat: Double? = null

        @SerializedName("lng")
        @Expose
        var lng: Double? = null
    }

    inner class Location {
        @SerializedName("address")
        @Expose
        var address: String? = null

        @SerializedName("crossStreet")
        @Expose
        var crossStreet: String? = null

        @SerializedName("lat")
        @Expose
        var lat: Double? = null

        @SerializedName("lng")
        @Expose
        var lng: Double? = null

        @SerializedName("labeledLatLngs")
        @Expose
        var labeledLatLngs: List<LabeledLatLng>? = null

        @SerializedName("distance")
        @Expose
        var distance: Int? = null

        @SerializedName("postalCode")
        @Expose
        var postalCode: String? = null

        @SerializedName("cc")
        @Expose
        var cc: String? = null

        @SerializedName("city")
        @Expose
        var city: String? = null

        @SerializedName("state")
        @Expose
        var state: String? = null

        @SerializedName("country")
        @Expose
        var country: String? = null

        @SerializedName("formattedAddress")
        @Expose
        var formattedAddress: List<String>? = null

        @SerializedName("neighborhood")
        @Expose
        var neighborhood: String? = null
    }

    inner class Meta {
        @SerializedName("code")
        @Expose
        var code: Int? = null

        @SerializedName("requestId")
        @Expose
        var requestId: String? = null
    }

    inner class Response {
        @SerializedName("venues")
        @Expose
        var venues: List<Venue>? = null

        @SerializedName("confident")
        @Expose
        var confident: Boolean? = null
    }

    inner class Stats {
        @SerializedName("tipCount")
        @Expose
        var tipCount: Int? = null

        @SerializedName("usersCount")
        @Expose
        var usersCount: Int? = null

        @SerializedName("checkinsCount")
        @Expose
        var checkinsCount: Int? = null

        @SerializedName("visitsCount")
        @Expose
        var visitsCount: Int? = null
    }

    inner class Venue {
        @SerializedName("id")
        @Expose
        var id: String? = null

        @SerializedName("name")
        @Expose
        var name: String? = null

        @SerializedName("contact")
        @Expose
        var contact: Contact? = null

        @SerializedName("location")
        @Expose
        var location: Location? = null

        @SerializedName("categories")
        @Expose
        var categories: List<Category>? =
            null

        @SerializedName("verified")
        @Expose
        var verified: Boolean? = null

        @SerializedName("stats")
        @Expose
        var stats: Stats? = null

        @SerializedName("beenHere")
        @Expose
        var beenHere: BeenHere? = null

        @SerializedName("venuePage")
        @Expose
        var venuePage: VenuePage? = null

        @SerializedName("hereNow")
        @Expose
        var hereNow: HereNow? = null

        @SerializedName("referralId")
        @Expose
        var referralId: String? = null

        @SerializedName("venueChains")
        @Expose
        var venueChains: List<Any>? = null

        @SerializedName("hasPerk")
        @Expose
        var hasPerk: Boolean? = null
    }

    inner class VenuePage {
        @SerializedName("id")
        @Expose
        var id: String? = null
    }
}