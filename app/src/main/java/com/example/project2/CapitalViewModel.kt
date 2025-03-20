package com.example.project2

import androidx.lifecycle.ViewModel

class CapitalViewModel : ViewModel() {
    private val stateList: List<Capital> = listOf(
        //create list of capital data class objects
        Capital("Alabama", "Montgomery"),
        Capital("Alaska", "Juneau"),
        Capital("Arizona", "Phoenix"),
        Capital("Arkansas", "Little Rock"),
        Capital("California", "Sacramento"),
        Capital("Colorado", "Denver"),
        Capital("Connecticut", "Hartford"),
        Capital("Delaware", "Dover"),
        Capital("Hawaii", "Honolulu"),
        Capital("Florida", "Tallahassee"),
        Capital("Georgia", "Atlanta"),
        Capital("Idaho", "Boise"),
        Capital("Indiana", "Indianapolis"),
        Capital("Illinois", "Springfield"),
        Capital("Iowa", "Des Moines"),
        Capital("Kansas", "Topeka"),
        Capital("Kentucky", "Frankfort"),
        Capital("Louisiana", "Baton Rouge"),
        Capital("Maine", "Augusta"),
        Capital("Maryland", "Annapolis"),
        Capital("Massachusetts", "Boston"),
        Capital("Minnesota", "St. Paul"),
        Capital("Michigan", "Lansing"),
        Capital("Mississippi", "Jackson"),
        Capital("Missouri", "Jefferson City"),
        Capital("Montana", "Helena"),
        Capital("Nebraska", "Lincoln"),
        Capital("Nevada", "Carson City"),
        Capital("New Hampshire", "Concord"),
        Capital("New Jersey", "Trenton"),
        Capital("New Mexico", "Santa Fe"),
        Capital("North Carolina", "Raleigh"),
        Capital("North Dakota", "Bismarck"),
        Capital("New York", "Albany"),
        Capital("Ohio", "Columbus"),
        Capital("Oklahoma", "Oklahoma City"),
        Capital("Oregon", "Salem"),
        Capital("Pennsylvania", "Harrisburg"),
        Capital("Rhode Island", "Providence"),
        Capital("South Carolina", "Columbia"),
        Capital("South Dakota", "Pierre"),
        Capital("Tennessee", "Nashville"),
        Capital("Texas", "Austin"),
        Capital("Utah", "Salt Lake City"),
        Capital("Vermont", "Montpelier"),
        Capital("Virginia", "Richmond"),
        Capital("Washington", "Olympia"),
        Capital("West Virginia", "Charleston"),
        Capital("Wisconsin", "Madison"),
        Capital("Wyoming", "Cheyenne")
    )

    fun showStateInfo(): String{
        val capitalObject = stateList.random()
        return "${capitalObject.capitalCity} " +
                "is the capital of ${capitalObject.state}"
    }
}