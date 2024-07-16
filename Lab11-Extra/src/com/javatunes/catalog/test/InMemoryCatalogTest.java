/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.ArrayList;
import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
//         testFindById();
        // testFindByKeyword();
//         testFindByCategory();
        // testSize();
//         testGetAll();

//        testFindSelfTitled();
        testFindRockLessThan();
    }

//    private static void testFindSelfTitled() {
//        InMemoryCatalog catalog = new InMemoryCatalog();
//
//        Collection<MusicItem> result = new ArrayList<>();
//
//        for (MusicItem item : catalogData) {
//            if (item.getTitle().equals(item.getArtist())) {
//                result.add(item);
//            }
//        }
//        return result;
//    }

    public static void testFindRockLessThan() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> cheapRockItems = catalog.findRockLessThan(12.0); // should be 3

        dump(cheapRockItems);

    }



    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem item = catalog.findById(6L); // autobox primitive long to Long object
        System.out.println(item);

        MusicItem item2 = catalog.findById(66L); // music item not found, should return null
        System.out.println(item2);
    }

    private static void testFindByKeyword() {

    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        dump(items);

    }

    private static void testSize() {
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> readOnlyItems = catalog.getAll(); // read only view of 18 songs in catalog
        readOnlyItems.clear(); // not happening, throws exception
    }

    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}