package com.example.placeholder.models

data class StringsTemplatesModel(
    val valuesFolderName: String,
    val templates: List<StringResourceModel>,
    val values: Map<String, String>
)