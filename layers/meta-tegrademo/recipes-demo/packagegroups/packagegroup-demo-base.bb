DESCRIPTION = "Packagegroup for inclusion in all Tegra demo images"

LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = " \
    haveged \
    procps \
    sshfs-fuse \
    strace \
    setup-nv-boot-control \
    tegra-uefi-capsules \
    tegra-tools-tegrastats \
"
