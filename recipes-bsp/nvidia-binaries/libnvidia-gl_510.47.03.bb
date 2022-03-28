L4T_DEB_COPYRIGHT_MD5 = "fab0c15b4bbf7f8d5ac2bd6673d4211c"

require nvidia-debian-libraries-common.inc

LICENSE += "& Apache-2.0"
LIC_FILES_CHKSUM += "file://usr/share/doc/nvidia-tegra/LICENSE.tegra_sensors;md5=e7fe81c64aaee40b3d9e5b11c3e0ea58"

MAINSUM = "3ce0c2497b979c9c1d684e6395a71d8d9061295e3412eaaa8a2d4a2831ecfd66"
MAINSUM:tegra210 = "0b8adccbbb0b77dd80012116d3c42d4833a616d45652ad6362c50ce5821d57fb"

TEGRA_LIBRARIES_TO_INSTALL = "\
    tegra/libnvcolorutil.so \
    tegra/libnvdc.so \
    tegra/libnvddk_2d_v2.so \
    tegra/libnvddk_vic.so \
    tegra/libnvdla_compiler.so \
    tegra/libnvdla_runtime.so \
    tegra/libnvidia-tls.so.${L4T_VERSION} \
    tegra/libnvimp.so \
    tegra/libnvll.so \
    tegra/libnvos.so \
    tegra/libnvphs.so \
    tegra/libnvrm.so \
    tegra/libnvrm_gpu.so \
    tegra/libnvrm_graphics.so \
    tegra/libsensors.hal-client.nvs.so \
    tegra/libsensors.l4t.no_fusion.nvs.so \
    tegra/libsensors_hal.nvs.so \
    ${SOC_SPECIFIC_LIBS} \
"

SOC_SPECIFIC_LIBS = "\
    tegra/libnvisp_utils.so \
    tegra/libnvpva.so \
"
SOC_SPECIFIC_LIBS:tegra210 = ""

FILES_SOLIBSDEV = ""
SOLIBS = ".so*"
RRECOMMENDS:${PN} = "kernel-module-nvgpu"
RDEPENDS:${PN} = "libnvidia-common liggl1 libegl1 libopengl0 libc libgcc libx11-6 libxext6"
RPROVIDES:${PN} = "libegl-vendor libglx-vendor"

#usr/
#usr/lib/
#usr/lib/x86_64-linux-gnu/
#usr/lib/x86_64-linux-gnu/libEGL_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libGLESv1_CM_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libGLESv2_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libGLX_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-eglcore.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-glcore.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-glsi.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-glvkspirv.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-ngx.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-rtcore.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-tls.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvoptix.so.510.47.03
#usr/lib/x86_64-linux-gnu/nvidia/
#usr/lib/x86_64-linux-gnu/nvidia/xorg/
#usr/lib/x86_64-linux-gnu/nvidia/xorg/libglxserver_nvidia.so.510.47.03
#usr/share/
#usr/share/doc/
#usr/share/doc/libnvidia-gl-510/
#usr/share/doc/libnvidia-gl-510/changelog.Debian.gz
#usr/share/doc/libnvidia-gl-510/copyright
#usr/share/glvnd/
#usr/share/glvnd/egl_vendor.d/
#usr/share/glvnd/egl_vendor.d/10_nvidia.json
#usr/share/vulkan/
#usr/share/vulkan/icd.d/
#usr/share/vulkan/icd.d/nvidia_icd.json
#usr/share/vulkan/icd.d/nvidia_layers.json
#usr/lib/x86_64-linux-gnu/libEGL_nvidia.so.0 -> libEGL_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libGLESv1_CM_nvidia.so.1 -> libGLESv1_CM_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libGLESv2_nvidia.so.2 -> libGLESv2_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libGLX_nvidia.so.0 -> libGLX_nvidia.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvidia-ngx.so.1 -> libnvidia-ngx.so.510.47.03
#usr/lib/x86_64-linux-gnu/libnvoptix.so.1 -> libnvoptix.so.510.47.03
#usr/lib/x86_64-linux-gnu/nvidia/xorg/libglxserver_nvidia.so -> libglxserver_nvidia.so.510.47.03

