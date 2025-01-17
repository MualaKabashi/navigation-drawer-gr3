package com.cacttus.navigationdrawergr_3.model

data class User(
    var id: Int,
    var name: String,
    var username: String,
    var email: String,
    var address: Address,
    var phone: String,
    var website: String,
    var company: Company
)

data class Address(
    var street: String,
    var suite: String,
    var city: String,
    var zipcode: String,
    var geo: Geo
)

data class Geo(
    var lat: String,
    var lng: String
)

data class Company(
    var name: String,
    var catchPhrase: String,
    var bs: String
)