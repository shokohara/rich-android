package com.github.shoscala.richandroid

import org.json._

object Defaults {

  implicit class RichJSONObject(json: JSONObject) {
    def getJSONObjectAsOpt(name: String) = try {
      Some(json.getJSONObject(name))
    } catch {
      case t: JSONException => None
    }

    def getLongAsOpt(name: String) = try {
      Some(json.getLong(name))
    } catch {
      case t: JSONException => None
    }

    def getStringAsOpt(name: String) = try {
      Some(json.getString(name))
    } catch {
      case t: JSONException => None
    }

    def getIntAsOpt(name: String) = try {
      Some(json.getInt(name))
    } catch {
      case t: JSONException => None
    }
  }
}
