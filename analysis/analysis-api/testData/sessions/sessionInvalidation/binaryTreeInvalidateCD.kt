// MODULE: L1
// MODULE_KIND: LibraryBinary
// FILE: l1.kt

// MODULE: L2
// MODULE_KIND: LibraryBinary
// FILE: l2.kt

// MODULE: G

// MODULE: F(L1)

// MODULE: E

// MODULE: D
// WILDCARD_MODIFICATION_EVENT

// MODULE: C(F, G, L2)
// WILDCARD_MODIFICATION_EVENT

// MODULE: B(D, E)

// MODULE: A(B, C)
