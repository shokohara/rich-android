package com.github.shoscala.richandroid

import org.json._
import android.view.View
import android.view.View.OnClickListener

object Defaults {

  implicit class RichView(view: View) {
    def onClick(f: View => Unit) {
      view.setOnClickListener(new OnClickListener {
        override def onClick(v: View) = f(v)
      })
    }
  }

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
