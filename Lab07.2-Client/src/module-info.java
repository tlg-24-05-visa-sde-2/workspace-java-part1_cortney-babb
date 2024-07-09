/*
 * This module contains one package:
 * com.entertainment.client
 * As the "client" module, it doesnt export anything,
 * but it DOES require the other module, com.entertainment
 */
module com.entertainment.client {
    // what other modules does this module depend on (use)?
    requires com.entertainment;
}