L4T_DEB_COPYRIGHT_MD5 = "ce4d36df31e6cc73581fd2a25d16834e"
DEPENDS = "tegra-libraries-core tegra-libraries-glxcore"

L4T_DEB_TRANSLATED_BPN = "nvidia-l4t-3d-core"
TEGRA_LIBRARIES_CONTAINER_CSV = ""

require nvidia-debian-libraries-common.inc

MAINSUM = "ef33408256a85a638c06c03683bb62a5d594ba4f5241763510cf23fbb43a2b47"
MAINSUM:tegra210 = "70fa171acb7f6203ffbb4adcf239132e5dccf0b759b09009bced3599fc1970c0"

do_install() {
    install -d ${D}${libdir}/xorg/modules/drivers
    install -m 0644 ${S}/usr/lib/xorg/modules/drivers/nvidia_drv.so ${D}${libdir}/xorg/modules/drivers/
    install -d ${D}${libdir}/xorg/modules/extensions
    install -m 0644 ${S}/usr/lib/xorg/modules/extensions/libglxserver_nvidia.so ${D}${libdir}/xorg/modules/extensions/
}

PACKAGES = "${PN}"
FILES:${PN} = "${libdir}"
RDEPENDS:${PN} += "xorg-video-abi-24 xserver-xorg-core libc libnvidia-cfg"
RPROVIDES:${PN} += "xserver-xorg-extension-glx"
RCONFLICTS:${PN} = "xserver-xorg-extension-glx"

INSANE_SKIP:${PN} = "dev-so textrel ldflags xorg-driver-abi"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

#
#usr/
#usr/lib/
#usr/lib/x86_64-linux-gnu/
#usr/lib/x86_64-linux-gnu/nvidia/
#usr/lib/x86_64-linux-gnu/nvidia/xorg/
#usr/lib/x86_64-linux-gnu/nvidia/xorg/nvidia_drv.so
#usr/share/
#usr/share/X11/
#usr/share/X11/xorg.conf.d/
#usr/share/X11/xorg.conf.d/10-nvidia.conf
#usr/share/doc/
#usr/share/doc/xserver-xorg-video-nvidia-510/
#usr/share/doc/xserver-xorg-video-nvidia-510/changelog.Debian.gz
#usr/share/doc/xserver-xorg-video-nvidia-510/copyright

