package com.arise.fromtheashes.model

class User {
    var fname: String=""
    var lname: String=""
    var email: String=""
    var pass: String=""
    var conpass: String=""
    var userid: String=""
    constructor(fname: String, lname: String,
                email: String, pass: String,
                conpass: String, userid: String){
        this.fname=fname
        this.lname=lname
        this.email=email
        this.pass=pass
        this.conpass=conpass
        this.userid=userid
    }
    constructor()
}