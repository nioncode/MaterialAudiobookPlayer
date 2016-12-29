package de.ph1b.audiobook.features.chromeCast

import com.google.android.gms.cast.framework.Session
import com.google.android.gms.cast.framework.SessionManagerListener

/**
 * Simple interface that extends the session manager listener and provides empty default methods
 *
 * @author Paul Woitaschek
 */
interface SimpleSessionManagerListener<T : Session> : SessionManagerListener<T> {

  override fun onSessionStartFailed(session: T, error: Int) {}

  override fun onSessionStarting(session: T) {}

  override fun onSessionEnded(session: T, error: Int) {}

  override fun onSessionResumeFailed(p0: T, error: Int) {}

  override fun onSessionStarted(session: T, sessionId: String?) {}

  override fun onSessionResumed(session: T, wasSuspended: Boolean) {}

  override fun onSessionResuming(session: T, sessionId: String?) {}

  override fun onSessionSuspended(session: T, reason: Int) {}

  override fun onSessionEnding(session: T) {}
}