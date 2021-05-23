USE [HRSchema]
GO

/****** Object:  Table [dbo].[EmployeeVacation]    Script Date: 7/17/2018 10:49:24 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[EmployeeVacation](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[FK_EmployeeID] [int] NOT NULL,
	[date] [datetime] NOT NULL,
	[vacationFrom] [datetime] NOT NULL,
	[vacationTo] [datetime] NOT NULL,
	[FK_AssignedTo_EmployeeID] [int] NOT NULL,
	[FK_VacationClass] [int] NOT NULL,
 CONSTRAINT [PK_EmployeeVacation] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[EmployeeVacation]  WITH CHECK ADD FOREIGN KEY([FK_AssignedTo_EmployeeID])
REFERENCES [dbo].[Employee] ([employeeID])
GO

ALTER TABLE [dbo].[EmployeeVacation]  WITH CHECK ADD  CONSTRAINT [FK_EmployeeVacation_Employee] FOREIGN KEY([FK_EmployeeID])
REFERENCES [dbo].[Employee] ([employeeID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO

ALTER TABLE [dbo].[EmployeeVacation] CHECK CONSTRAINT [FK_EmployeeVacation_Employee]
GO

ALTER TABLE [dbo].[EmployeeVacation]  WITH CHECK ADD  CONSTRAINT [FK_EmployeeVacation_VacationClasses] FOREIGN KEY([FK_VacationClass])
REFERENCES [dbo].[VacationClasses] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO

ALTER TABLE [dbo].[EmployeeVacation] CHECK CONSTRAINT [FK_EmployeeVacation_VacationClasses]
GO

