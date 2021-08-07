fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { collection.any { it % 2 == 0 } }
