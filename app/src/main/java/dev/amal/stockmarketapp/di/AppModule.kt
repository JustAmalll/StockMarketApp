package dev.amal.stockmarketapp.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.amal.stockmarketapp.data.local.StockDatabase
import dev.amal.stockmarketapp.data.remote.StockApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideStockApi(): StockApi =
        Retrofit.Builder()
            .baseUrl(StockApi.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()


    @Provides
    @Singleton
    fun provideStockDatabase(app: Application): StockDatabase =
        Room.databaseBuilder(app, StockDatabase::class.java, "stockdb.db").build()

}