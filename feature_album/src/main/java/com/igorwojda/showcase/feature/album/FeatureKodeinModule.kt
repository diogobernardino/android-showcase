package com.igorwojda.showcase.feature.album

import com.igorwojda.showcase.app.feature.gateway.KodeinModuleProvider
import com.igorwojda.showcase.feature.album.data.dataModule
import com.igorwojda.showcase.feature.album.domain.domainModule
import com.igorwojda.showcase.feature.album.presentation.presentationModule
import org.kodein.di.Kodein

internal const val FEATURE_NAME = "Album"

object FeatureKodeinModule : KodeinModuleProvider {

    override val kodeinModule = Kodein.Module("${FEATURE_NAME}Module") {
        import(presentationModule)
        import(domainModule)
        import(dataModule)
    }
}
