CUDA_FULL_VERSION = "10.2.300-1"
require cuda-shared-libraries-${CUDA_FULL_VERSION}.inc

MAINSUM = "661a91f35f2d148d938ca907484ebe48727b17f03a8cbb6992e60bb792738caf"
MAINSUM:x86-64 = "ee3710341b8669030b77351020006c9ecaa0db504782cf249ff0b59c901f8a21"
DEVSUM = "43bf089682f745397c7c72bb53ce6d962e2d24246e1e7e686fd8159d3ddf7ba1"
DEVSUM:x86-64 = "df2ddf26431ac96fc53e0da5229a84faf8f11749c190227584b698de5c09779c"

BBCLASSEXTEND = "native nativesdk"

