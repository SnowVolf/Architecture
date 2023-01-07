package ru.svolf.architectre.lesson1

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class MyServer : LifecycleEventObserver {
    companion object {
        private const val TAG = "MyServer"
    }

    fun connect(){
        Log.d(TAG, "connect() called")
    }

    fun disconnect(){
        Log.d(TAG, "disconnect() called")
    }

    /**
     * Called when a state transition event happens.
     *
     * @param source The source of the event
     * @param event The event
     */
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event) {
            Lifecycle.Event.ON_START -> connect()
            Lifecycle.Event.ON_STOP -> disconnect()
            else -> {
                Log.d(TAG, "onStateChanged: other state called")
            }
        }
    }
}