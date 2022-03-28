L4T_DEB_COPYRIGHT_MD5 = "fab0c15b4bbf7f8d5ac2bd6673d4211c"

require nvidia-debian-libraries-common.inc

LICENSE += "& Apache-2.0"
LIC_FILES_CHKSUM += "file://usr/share/doc/nvidia-tegra/LICENSE.tegra_sensors;md5=e7fe81c64aaee40b3d9e5b11c3e0ea58"

MAINSUM = "3ce0c2497b979c9c1d684e6395a71d8d9061295e3412eaaa8a2d4a2831ecfd66"

do_install() {

}

FILES:${PN} += " \
                ${datadir}/nvidia/ \
                "
                
#
#/usr/share/nvidia/
#/usr/share/nvidia/nvidia-application-profiles-510.47.03-key-documentation
#/usr/share/nvidia/nvidia-application-profiles-510.47.03-rc
#