package com.example.onlinestoremanagementsystem.products

import com.example.onlinestoremanagementsystem.products.categories.CategoryElectronicsProduct

/**
 * Represents an electronics product in the store.
 *
 * @property id The unique identifier for the product.
 * @property name The name of the product.
 * @property status The availability status of the product.
 * @property price The price of the product in the store.
 * @property energyConsumption The energy consumption rating of the product.
 * @property warranty The warranty period for the product.
 * @property category The category of electronics (e.g., SMARTPHONE, COMPUTER).
 */
class ElectronicsProduct(
    override val id: String,
    override val name: String,
    override var status: Enum<Status>,
    override var price: Double,
    val energyConsumption: Int,
    val warranty: String,
    val category: Enum<CategoryElectronicsProduct>
) : Product() {
    /**
     * Prints all information about the electronics product, including warranty and energy consumption.
     * Calls the superclass's `printAllProductInfo` method and adds category information.
     */
    override fun printAllProductInfo() {
        super.printAllProductInfo()
        println("warranty: ${warranty} energy consumption :${energyConsumption} category:${category}")
    }
}