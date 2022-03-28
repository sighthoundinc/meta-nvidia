DESCRIPTION = "Dummy recipe for bringing in CUDA libraries"
LICENSE = "MIT"

CUDA_COMPONENTS = " \
    cuda-nsight-systems \
    cuda-libraries-dev \
    cuda-nsight-compute \
    cuda-nvml-dev \
    cuda-nsight \
    cuda-nvvp \
"
DEPENDS = "${CUDA_COMPONENTS}"

do_fetch[noexec] = "1"
do_unpack[noexec] = "1"
do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"

COMPATIBLE_MACHINE:class-target = "tegra"
PACKAGE_ARCH:class-target = "${TEGRA_PKGARCH}"

PACKAGES = "${PN} ${PN}-dev"
ALLOW_EMPTY:${PN} = "1"
RDEPENDS:${PN} = "${CUDA_COMPONENTS}"
RDEPENDS:${PN}-dev = "${@' '.join(['%s-dev' % pkg for pkg in d.getVar('CUDA_COMPONENTS').split()])} cuda-nvml-dev"
BBCLASSEXTEND = "native nativesdk"
