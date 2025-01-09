package com.khalodark.androidcomposetdd

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun verifyExistingHomeScreenDisplaed() {
        // given
        composeTestRule.setContent {
            MainApp()
        }
        // when
        // assertion
        composeTestRule.onNodeWithText("Home Screen").assertIsDisplayed()

    }
}