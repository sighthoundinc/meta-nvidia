CUDA_PKG ?= "${BPN} ${BPN}-dev"
REPLACE_STUBS ?= "1"
CUDA_FULL_VERSION ?= "${PV}"

require cuda-binaries-common-defs.inc

L4T_DEB_GROUP ?= "${BPN}"
L4T_DEB_FEED_BASE ??= "file://"
CUDA_LICENSE_PKG ?= "cuda-documentation-${CUDA_VERSION_DASHED}_${CUDA_FULL_VERSION}_${CUDA_DEB_PKGARCH}.deb;name=lic;subdir=${BP}"
SRC_COMMON_DEBS = "${@' '.join(['%s-${CUDA_VERSION_DASHED}_${PV}_${CUDA_DEB_PKGARCH}.deb;name=%s;subdir=${BP}' \
                                % (pkg, 'dev' if pkg.endswith('-dev') else 'main') for pkg in d.getVar('CUDA_PKG').split()])} \
	           ${CUDA_LICENSE_PKG}"


SRC_URI[main.sha256sum] = "${MAINSUM}"
SRC_URI[dev.sha256sum] = "${DEVSUM}"
LICSUM = "d8e8c62156516d5eb2dea0ba49abd1b5cecae010872e0e71650e97a1ccd2e005"
LICSUM:x86-64 = "a64ce62b15263317cdb9c9481433b47b5754ea19f89cdb1007a7da1ac29713cd"
SRC_URI[lic.sha256sum] = "${LICSUM}"
L4T_DEB_GROUP[lic] = "cuda-documentation"

CUDA_DL_CLASS = "l4t_deb_pkgfeed"

inherit ${CUDA_DL_CLASS}

DESCRIPTION = "CUDA package ${PN}"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/local/cuda-10.2/EULA.txt;md5=c3efeff9b7401d0a242a86d9051a8815"

CUDA_VERSION_DASHED = "${@d.getVar('CUDA_VERSION').replace('.','-')}"

CUDA_PKGNAMES ?= "${@' '.join(['%s-${CUDA_VERSION_DASHED}_${PV}_${CUDA_DEB_PKGARCH}.deb' % pkg for pkg in d.getVar('CUDA_PKG').split()])}"

