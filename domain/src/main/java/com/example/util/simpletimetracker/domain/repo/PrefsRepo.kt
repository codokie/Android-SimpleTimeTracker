package com.example.util.simpletimetracker.domain.repo

import com.example.util.simpletimetracker.domain.model.StatisticsWidgetData

interface PrefsRepo {

    var recordTypesFilteredOnChart: Set<String>

    var categoriesFilteredOnChart: Set<String>

    var chartFilterType: Int

    var cardOrder: Int

    var statisticsRange: Int
    var statisticsRangeCustomStart: Long
    var statisticsRangeCustomEnd: Long

    var statisticsDetailRange: Int
    var statisticsDetailRangeCustomStart: Long
    var statisticsDetailRangeCustomEnd: Long

    var keepStatisticsRange: Boolean

    var firstDayOfWeek: Int

    var startOfDayShift: Long // in milliseconds

    var showUntrackedInRecords: Boolean

    var showRecordsCalendar: Boolean

    var allowMultitasking: Boolean

    var showNotifications: Boolean

    var inactivityReminderDuration: Long // in seconds

    var ignoreShortRecordsDuration: Long // in seconds

    var darkMode: Boolean

    var numberOfCards: Int

    var useMilitaryTimeFormat: Boolean

    var useProportionalMinutes: Boolean

    var keepScreenOn: Boolean

    var showRecordTagSelection: Boolean

    var recordTagSelectionCloseAfterOne: Boolean

    fun setWidget(widgetId: Int, recordType: Long)

    fun getWidget(widgetId: Int): Long

    fun removeWidget(widgetId: Int)

    fun setStatisticsWidget(widgetId: Int, data: StatisticsWidgetData)

    fun getStatisticsWidget(widgetId: Int): StatisticsWidgetData

    fun removeStatisticsWidget(widgetId: Int)

    fun setCardOrderManual(cardOrder: Map<Long, Long>)

    fun getCardOrderManual(): Map<Long, Long>

    fun clear()
}