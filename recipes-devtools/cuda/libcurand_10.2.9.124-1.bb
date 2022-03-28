CUDA_FULL_VERSION = "10.2.300-1"
require cuda-shared-libraries-${CUDA_FULL_VERSION}.inc

MAINSUM = "45f2bbafdde70b8b8bcdc6f0625a2ab334632b6659f153224654d03e1776057b"
MAINSUM:x86-64 = "402710e3ebcb251414d97634d45faee1e5ce5f9191e17bebc3a37bd9fe93265d"
DEVSUM = "7da1321d221290c7c8dcf49bef8970712cb981d8f9a93f405a080364f1bf0b12"
DEVSUM:x86-64 = "70bc9f0f931d18f884f8f6f996161935e9c2e6f6ec3d357bdb3dcd4049baf68f"

BBCLASSEXTEND = "native nativesdk"
