package de.ph1b.audiobook.features.chromeCast

import android.content.Context
import com.google.android.gms.cast.framework.CastOptions
import com.google.android.gms.cast.framework.OptionsProvider
import de.ph1b.audiobook.BuildConfig

/**
 * The basic options provider for chromecast
 *
 * @author Paul Woitaschek
 */
class CastOptionsProvider : OptionsProvider {
  override fun getCastOptions(context: Context): CastOptions = CastOptions.Builder()
    .setReceiverApplicationId(BuildConfig.CAST_ID)
    .build()

  override fun getAdditionalSessionProviders(context: Context?) = null
}
